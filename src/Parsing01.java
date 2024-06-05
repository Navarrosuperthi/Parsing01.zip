
public class Parsing01 {
    public static void main(String[] args) {
        // Declarar e inicializar as Strings com os valores que deu
        String shirtPrice = "15";
        String taxaRate = "0.05";
        String gibberish = "887ds7nds87dsfs";

        // Converter e imprimir shirtPrice como int
        int shirtPriceInt = Integer.parseInt(shirtPrice);
        System.out.println("O preco da camisa e: " + shirtPriceInt);

        // Converter e imprimir taxRate como double
        double taxRateDouble = Double.parseDouble(taxaRate);
        System.out.println("A taxa de imposto e: " + taxRateDouble);

        // Tentar converter gibberish para int (isso vai da um erro)
        try {
            int gibberishInt = Integer.parseInt(gibberish);
            System.out.println("O valor gibberish convertido para int e: " + gibberishInt);
        } catch (NumberFormatException e) {
            System.out.println("Erro ao converter gibberish para int: " + e.getMessage());
        }

        // Tentar converter gibberish para double (vai da erro de novo)
    }    
}          
       