package com.solid_principles.lsp.problem;

public class WhatsApp extends SocialMedia{ //parent class is not replaceable by this child class, does not follow LSP
    @Override
    public void chatWithFriend() {

    }

    @Override
    public void publishPost(Object post) {
    // Not applicable for WhatsApp
    }

    @Override
    public void sendPhotosAndVideos() {

    }

    @Override
    public void groupVideoCall(String... users) {

    }
}
