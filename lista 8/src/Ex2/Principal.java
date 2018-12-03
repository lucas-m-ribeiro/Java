package Ex2;

import java.io.File;

public class Principal {
    public static void main (String[] args) {
        (new FiltrarEmails()).filtrar (new File ("arquivo.txt"));
    }
}
