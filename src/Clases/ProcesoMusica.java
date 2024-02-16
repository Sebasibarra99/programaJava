package Clases;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class ProcesoMusica extends Thread {
    private Clip clip;
    private String ruta;

    public ProcesoMusica(String ruta) {
        this.ruta = ruta;
    }

    public void cargarSonido(String ruta) {
        try {
            File archivoSonido = new File(ruta);
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(archivoSonido);
            clip = AudioSystem.getClip();
            clip.open(audioInputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void reproducir() {
        if (clip != null) {
            clip.setFramePosition(0);
            clip.start();
        }
    }

    public void detener() {
        if (clip != null && clip.isRunning()) {
            clip.stop();
        }
    }

    @Override
    public void run() {
        cargarSonido(ruta);
        reproducir();
    }
}
