package net.mips.compiler;

public enum CodesErr {
    CAR_INC_ERR("CARACTERE INCONNU"), FIC_VID_ERR("FICHIER VIDE");

    private String message;

   private CodesErr(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}


