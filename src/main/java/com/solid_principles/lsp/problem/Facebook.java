package com.solid_principles.lsp.problem;

public class Facebook extends SocialMedia{ //parent class is replaceable by this child class, follow LSP
    @Override
    public void chatWithFriend() {

    }

    @Override
    public void publishPost(Object post) {

    }

    @Override
    public void sendPhotosAndVideos() {

    }

    @Override
    public void groupVideoCall(String... users) {

    }
}
