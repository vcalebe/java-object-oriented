package empresa;

public class Data {
    String dia;
    String mes;
    String ano;

    void insereData(String dia, String mes, String ano){
        this.dia = dia;
        this.mes = mes;
        this. ano = ano;
    }

    String consultaData(){
        String data = (this.dia+"/"+this.mes+"/"+this.ano);
        return data;
    }
}
