package com.generics.codegen;


import java.util.*;

public class BeanBox<E>
{
    public static String ANY = "ANY";

    protected RuleType type;
    protected boolean anyType;
    protected Map<String, BBSet<E>> mapSchemes = new HashMap<>();
    protected BBSet<E> EMPTY = new BBSet<E>();
    protected BBSet<E> anyList = new BBSet<E>();

    public BeanBox( RuleType type )
    {
        this.type = type;
    }

    public RuleType getType()
    {
        return type;
    }

    public int getMapSize()
    {
        return mapSchemes.size();
    }

    public BBSet<Long>[] find( String category )
    {
        if( isAnyType() )
        {
            category = ANY;
        }

        BBSet<E> ids = mapSchemes.get( category );
        if( ids != null )
        {
            return new BBSet[]{ids, anyList};
        }
        return new BBSet[]{anyList};
    }

    public BBSet<Long>[] findAll( java.util.List<String> values )
    {
        if( isAnyType() )
        {
            return new BBSet[]{anyList};
        }

        ArrayList<BBSet<E>> list = new ArrayList<>();
        for( String value : values )
        {
            BBSet<E> ids = mapSchemes.get( value );
            if( ids != null )
            {
                list.add( ids );
            }
        }
        list.add( anyList );
        return list.toArray( new BBSet[list.size()] );
    }

    public void put( String category, E schemeId )
    {
        BBSet<E> list;
        if( category.equals( ANY ) )
        {
            list = anyList;
        }
        else
        {
            list = mapSchemes.get( category );
            if( list == null )
            {
                list = new BBSet<E>();
                mapSchemes.put( category, list );
            }
        }

        if( !list.contains( schemeId ) )
        {
            list.add( schemeId );
        }
        checkForAnyType();
    }

    public boolean removeFromBox( long schemeId )
    {
        Collection<BBSet<E>> values = mapSchemes.values();
        for( BBSet<E> set : values )
        {
            set.remove( schemeId );
        }

        anyList.remove( schemeId );
        validateEmptyData();
        return false;
    }

    public boolean isAnyType()
    {
        return anyType;
    }

    public void setAnyType( boolean anyType )
    {
        this.anyType = anyType;
    }

    public void sort()
    {
        ArrayList<E> anyListTemp = new ArrayList<E>( anyList );
//        Collections.sort( anyListTemp, comparatorLong );
        anyList = new BBSet<E>( anyListTemp );

        Iterator<String> keys = mapSchemes.keySet().iterator();
        while( keys.hasNext() )
        {
            String key = keys.next();
            BBSet<E> list = mapSchemes.get( key );

            ArrayList<E> longs = new ArrayList<E>( list );
//            Collections.sort( longs, comparatorLong );
            mapSchemes.put( key, new BBSet<E>( longs ) );
        }
        // BBSet is alreay sorted
    }

    /**
     * When update the scheme, there may be situation, that some boxes may be empty. Those need to be removed
     * >38:Booking Type[size=7]
     * ~ ANY size= 4 : [14801, 14807, 14809, 14798]
     * ~ GRP size= 1 : [14810]
     * ~ STD size= 1 : [14810]
     * ~ BUS size= 1 : [14810]
     * ~ STF size= 0 : [] ***need to remove
     * ~ TOP size= 1 : [14810]
     * ~ SUP size= 0 : [] ***need to remove
     * ~ TAG size= 1 : [14810]
     * ~ Total size= 5
     */
    public void validateEmptyData()
    {
        Iterator<String> categories = mapSchemes.keySet().iterator();
        ArrayList<String> listToRemove = new ArrayList<String>();
        while( categories.hasNext() )
        {
            String category = categories.next();
            BBSet<E> ids = mapSchemes.get( category );
            if( ids == null || ids.isEmpty() )
            {
                listToRemove.add( category );
            }
        }
        for( String key : listToRemove )
        {
            mapSchemes.remove( key );
        }
    }

    public void checkForAnyType()
    {
        if( mapSchemes.size() == 0 )
        {
            setAnyType( true );
        }
        else
        {
            setAnyType( false );
        }
    }

    public void clear()
    {
        setAnyType( false );
        mapSchemes.clear();
        anyList.clear();
    }

    public String trace()
    {
        StringBuilder sb = new StringBuilder( type + ":" + ( isAnyType() ? "[" + ANY + "]" : "" ) +  type.toString()  + "[size=" + getMapSize() + "]" );
        Iterator<String> it = mapSchemes.keySet().iterator();
        int tot = 0;
        sb.append( "\n" ).append( ANY ).append( " size= " ).append( anyList.size() ).append( " : " ).append( anyList );
        while( it.hasNext() )
        {
            String next = it.next();
            BBSet<E> list = mapSchemes.get( next );
            sb.append( "\n" ).append( next ).append( " size= " ).append( list.size() ).append( " : " ).append( list );
            tot += list.size();
        }
        sb.append( "\nTotal size= " ).append( tot );
        return sb.toString();
    }


    public String toString()
    {
        return type + ":" + ( isAnyType() ? "[" + ANY + "]" : "" ) +  type.toString() + ":" + mapSchemes.size();
    }

    Comparator<Long> comparatorLong = new Comparator<Long>()
    {
        public int compare( Long o1, Long o2 )
        {
            return o1.compareTo( o2 );
        }
    };

    class CustomComparator<T extends Comparable<T>> implements Comparator<T> {
        public int compare(T a, T b) {
            return a.compareTo(b);
        }
    }
}

