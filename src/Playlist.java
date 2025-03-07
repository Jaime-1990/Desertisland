import java.util.Arrays;
import java.util.ArrayList;

public class Playlist {
    String[] favoriteSongs = new String[10];
    ArrayList<String> desertIslandPlaylist = new ArrayList<String>();

    public Playlist() {
        // favorite songs
        favoriteSongs[0] = "Diomedes Días - La vida del artista ";
        favoriteSongs[1] = "Paola Jara y Chiquis - Lo que no sirve que no estorbe";
        favoriteSongs[2] = "Edie Herrea - El vicio de tus labios";
        favoriteSongs[3] = "Rafael Orozco - Miedo al amor";
        favoriteSongs[4] = "Becky G - Esquinas";
        favoriteSongs[5] = "Silvestre Dangond - La gringa";
        favoriteSongs[6] = "Shakira - Donde están los ladrones";
        favoriteSongs[7] = "Bad Bunny - Un preview";
        favoriteSongs[8] = "Feid - MOR, No Le Temas a La Oscuridad";
        favoriteSongs[9] = "Maluma y Carin Leon - Según quién";
        // Songs for desert
        desertIslandPlaylist.add("ROSALÍA, J Balvin – Con Altura ft. El Guincho");
        desertIslandPlaylist.add("Dua Lipa – Swan Song (From Alita: Battle Angel)");
        desertIslandPlaylist.add("Reik, Wisin & Yandel – Duele");
        desertIslandPlaylist.add("Sofia Reyes – R.I.P. (feat. Rita Ora & Anitta)");
        desertIslandPlaylist.add("Becky G – Green Light Go");
        // Agregar todas las canciones favoritas en el Arraylist
        desertIslandPlaylist.addAll(Arrays.asList(favoriteSongs));
        // quitar canciones del Arraylist
        desertIslandPlaylist.remove(1);
        desertIslandPlaylist.remove(2);
        desertIslandPlaylist.remove(3);
        desertIslandPlaylist.remove(7);
        desertIslandPlaylist.remove(0);
        desertIslandPlaylist.remove(6);
        desertIslandPlaylist.remove(4);
        desertIslandPlaylist.remove(1);
        desertIslandPlaylist.remove(3);
        desertIslandPlaylist.remove(0);
    }

    public void playSongs() {
        System.out.println("First three songs of favorite list: ");
        System.out.println("\t-" + favoriteSongs[0]);
        System.out.println("\t-" + favoriteSongs[1]);
        System.out.println("\t-" + favoriteSongs[2]);
        System.out.println("Songs for a desert Island...");
        System.out.println(desertIslandPlaylist);
        // Verificar el tamaño
        System.out.println(desertIslandPlaylist.size());


    }
}


