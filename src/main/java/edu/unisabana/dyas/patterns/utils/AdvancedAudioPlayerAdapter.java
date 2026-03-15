package edu.unisabana.dyas.patterns.utils;

public class AdvancedAudioPlayerAdapter implements AudioPlayer {

    private final AdvancedAudioPlayer advancedAudioPlayer;

    public AdvancedAudioPlayerAdapter(AdvancedAudioPlayer advancedAudioPlayer) {
        this.advancedAudioPlayer = advancedAudioPlayer;
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType == null) {
            System.out.println("Tipo de audio no soportado: null");
            return;
        }

        if ("mp4".equalsIgnoreCase(audioType)) {
            advancedAudioPlayer.playMp4(fileName);
            return;
        }

        if ("vlc".equalsIgnoreCase(audioType)) {
            advancedAudioPlayer.playVlc(fileName);
            return;
        }

        System.out.println("Tipo de audio no soportado: " + audioType);
    }

    @Override
    public void stop() {
        advancedAudioPlayer.stop();
    }
}
