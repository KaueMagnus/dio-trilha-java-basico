package estabelecimento;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.digitalizadora.Scanner;
import equipamentos.impressora.DeskJet;
import equipamentos.impressora.Impressora;
import equipamentos.impressora.LaserJet;
import equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();

        Scanner scanner = new Scanner();

        Impressora impressora = deskjet;
        Digitalizadora digitalizadora = scanner;
        Copiadora copiadora = em;


        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();
    }
}
