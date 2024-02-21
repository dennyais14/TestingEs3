import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

//Crea un oggetto OffsetDateTime da questa stringa 2023-03-01T13:00:00Z
//Formatta la data ottenendo 01 marzo 2023
//Stampa sulla console
//Fai attenzione a usare almeno Java 8
//Crea dei test per questo esercizio

public class Main {
    public static void main(String[] args) {
        String date1 = "2023-03-01T13:00:00Z";
        OffsetDateTime data1 = OffsetDateTime.parse(date1);
        String giornoSettimana = getGiornoSettimana(data1);
        System.out.println(giornoSettimana);
    }

    public static String getGiornoSettimana(OffsetDateTime data1) {
        DateTimeFormatter dataFormattata = DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY);
        String dateFormatted = data1.format(dataFormattata);
        System.out.println(dateFormatted);
        return String.valueOf(data1.getDayOfWeek());
    }

    public boolean isDateAfter (OffsetDateTime data1, OffsetDateTime data2){
        if (data1 != null && data2 != null){
            return data1.isAfter(data2);
        }
        else {
            return false;
        }

    }


}