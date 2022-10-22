package net.mips.compiler;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Scanner {
    private List<Symboles> motsCles;
    private Symboles symbCour;
    private char carCour;
    private FileReader fluxSour;

    private final int EOF =-1;

    public Scanner(String filename) throws FileNotFoundException {
//        File f = new File(filename);
//        if (!f.exists()){
//            System.out.println(CodesErr.FIC_VID_ERR.getMessage());
//        }
        this.fluxSour = new FileReader(filename);
        this.motsCles = new ArrayList<>();
    }
    public void initMotsCles(){
//        this.motsCles.add(new Symboles(Tokens.AFFEC_TOKEN,"="));
//        this.motsCles.add(new Symboles(Tokens.PLUS_TOKEN,"+"));
//        this.motsCles.add(new Symboles(Tokens.MOINS_TOKEN,"-"));
//        this.motsCles.add(new Symboles(Tokens.MUL_TOKEN,"*"));
//        this.motsCles.add(new Symboles(Tokens.DIV_TOKEN,"/"));
//        this.motsCles.add(new Symboles(Tokens.EG_TOKEN,"=="));
//        this.motsCles.add(new Symboles(Tokens.DIFF_TOKEN,"!="));
//        this.motsCles.add(new Symboles(Tokens.INF_TOKEN,"<"));
//        this.motsCles.add(new Symboles(Tokens.SUP_TOKEN,">"));
//        this.motsCles.add(new Symboles(Tokens.INFEG_TOKEN,"<="));
//        this.motsCles.add(new Symboles(Tokens.SUPEG_TOKEN,">="));
//        this.motsCles.add(new Symboles(Tokens.VIR_TOKEN,","));
//        this.motsCles.add(new Symboles(Tokens.PVIR_TOKEN,";"));
//        this.motsCles.add(new Symboles(Tokens.PNT_TOKEN,"."));
//        this.motsCles.add(new Symboles(Tokens.PARD_TOKEN,")"));
//        this.motsCles.add(new Symboles(Tokens.PARG_TOKEN,"("));
        this.motsCles.add(new Symboles(Tokens.BEGIN_TOKEN,"begin"));
        this.motsCles.add(new Symboles(Tokens.END_TOKEN,"end"));
        this.motsCles.add(new Symboles(Tokens.IF_TOKEN,"if"));
        this.motsCles.add(new Symboles(Tokens.WHILE_TOKEN,"while"));
        this.motsCles.add(new Symboles(Tokens.DO_TOKEN,"do"));
        this.motsCles.add(new Symboles(Tokens.THEN_TOKEN,"then"));
        this.motsCles.add(new Symboles(Tokens.WRITE_TOKEN,"write"));
        this.motsCles.add(new Symboles(Tokens.READ_TOKEN,"read"));
        this.motsCles.add(new Symboles(Tokens.CONST_TOKEN,"const"));
        this.motsCles.add(new Symboles(Tokens.VAR_TOKEN,"var"));
        this.motsCles.add(new Symboles(Tokens.PROGRAM_TOKEN,"program"));
        this.motsCles.add(new Symboles(Tokens.ERR_TOKEN,"err"));
    }

    public Tokens codeLex(String mot){


        for (Symboles sym : symbCour) {

        }

//        switch (mot) {
//
//            case "+": return Tokens.PLUS_TOKEN;
//            case "-": return Tokens.MOINS_TOKEN;
//            case "*": return Tokens.MUL_TOKEN;
//            case "/": return Tokens.DIV_TOKEN;
//            case "==": return Tokens.EG_TOKEN;
//            case "!=": return Tokens.DIFF_TOKEN;
//            case "<": return Tokens.INF_TOKEN;
//            case ">": return Tokens.SUP_TOKEN;
//            case "<=": return Tokens.INFEG_TOKEN;
//            case ">=": return Tokens.SUPEG_TOKEN;
//            case ",": return Tokens.VIR_TOKEN;
//            case ";": return Tokens.PVIR_TOKEN;
//            case ".": return Tokens.PNT_TOKEN;
//            case ")": return Tokens.PARD_TOKEN;
//            case "(": return Tokens.PARG_TOKEN;
//            default:  return Tokens.ID_TOKEN;
//        }

       return null;
    }

    public void lireCar() throws IOException{
        this.carCour = (char)this.fluxSour.read();
    }

    public void lireNombre(){

    }


//    void isDigit(){};
//    void isEqualEgnore(){};
    public void lireMot() throws IOException{

    }

    public void symbSuiv(){

    }
    public List<Symboles> getMotsCles() {
        return motsCles;
    }

    public void setMotsCles(List<Symboles> motsCles) {
        this.motsCles = motsCles;
    }

    public Symboles getSymbCour() {
        return symbCour;
    }

    public void setSymbCour(Symboles symbCour) {
        this.symbCour = symbCour;
    }

    public char getCarCour() {
        return carCour;
    }

    public void setCarCour(char carCour) {
        this.carCour = carCour;
    }

    public FileReader getFluxSour() {
        return fluxSour;
    }

    public void setFluxSour(FileReader fluxSour) {
        this.fluxSour = fluxSour;
    }
}
