package com.solid_principles.lsp.problem;

public abstract class SocialMedia {
    public abstract  void chatWithFriend();

    public abstract void publishPost(Object post);

    public abstract  void sendPhotosAndVideos();

    public abstract  void groupVideoCall(String... users);
}