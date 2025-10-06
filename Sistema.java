package Astronomia;

import java.util.ArrayList;

public class Sistema {
    private ArrayList<CorpoCeleste> corpicelesti;

    public Sistema() {

        this.corpicelesti = new ArrayList<>();
    }

    public void aggiungi(CorpoCeleste cc) {

        corpicelesti.add(cc);
    }

    public int contaStelle() {

        int x = 0;

        for (CorpoCeleste cc : corpicelesti) {

            if (cc instanceof Stella) {
                x++;

            }
        }
        return x;

    }

    public boolean pianetiConsecutivi() {

        int x = 0;

        // Scorro tutto l array
        for (int i = 0; i < corpicelesti.size(); i++) {

            // Se corpicelesti.get(i) è un piaeta, controllo quelli successivi
            if (corpicelesti.get(i) instanceof Pianeta) {

                for (x++; x < corpicelesti.size(); x++) {
                    if (corpicelesti.get(x) instanceof Pianeta) {

                    } else {

                        return false;

                    }

                }
                x++;

            }

        }

        return true;

    }

    // Rimozione di un pianeta inserendo il suo nome
    public int rimuoviPianeti(String s) {
        int x = 0;
        for (int i = 0; i < corpicelesti.size(); i++) {
            if (corpicelesti.get(i).getNome().contains(s)) {
                corpicelesti.remove(i);
                x++;
            }
        }
        return x;
    }

   /*  public boolean ordinaPianeti(){

        double min;
         for (int i = 0; i < corpicelesti.size(); i++) {

            if (corpicelesti.get(i) instanceof Pianeta){

                 min = corpicelesti.get(i).getDistanzaStella();

                 

            }
            
        }
    }*/
}
