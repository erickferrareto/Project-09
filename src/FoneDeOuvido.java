public class FoneDeOuvido {

    private boolean confort;
    private String color;
    private int buttons;

    //Métodos especiais

    public void setConfort(boolean c){
        this.confort = c;
    }
    public boolean getConfort(){
        return this.confort;
    }
    public void setColor(String co){
        this.color = co;
    }
    public String getColor(){
        return this.color;
    }
    public void setButtons(int b){
        this.buttons = b;
    }
    public int getButtons(){
        return this.buttons;
    }

    public void confortavel(){
        if (getConfort() == true){
            System.out.println("Este fone é confortavel");
        } else{
            System.out.println("Este fone não é confortavel");
        }
    }
    public void cor(){
        System.out.println("O fone é da cor " + getColor());
    }
    public void botão(){
        System.out.println("O fone tem " + getButtons() + " botões");
    }

}
