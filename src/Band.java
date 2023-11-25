import java.util.Objects;
import java.util.Scanner;
import java.util.Arrays;

public class Band {
    public static void main(String[] args) {
        String allbands = "Dreamfall in vain,BFI,Numode,Main-de-gloire,Shokran,Sienna skies,LANDMVRKS,Bad omens,Slaughter to prevail,I see stars,Asking alexandria,Confide,Rise of the northstar,7paca,Abandon all ships,AMATORY,As i lay dying,Aspirin rose,Attack Attack,Attila,August burns red,Beartooth,Betraying the martyrs,Bilmuri,blessthefall,blink 182,Breathe carolina,Bring Me The Horizon,Caliban,Carnifex,Chelsea grin,Chunk no captain Chunk,Crown the Empire,A day to remember,Dead silence hides my cries,Deftones,Depressed mode,The Devil Wears Prada,Electric Callboy,Emmure,Enter Shikari,Fall out boy,Get the shot,Good charlotte,Green day,Gutrectomy,Hatebreed,Helia,HIM,Hopes die last,Ice nine kills,I Prevail,I set my friends on fire,Jamies Elsewhere,Jane air,Knocked loose,Killswitch Engage,Korn,Limp bizkit,Lionheart,Lorna shore,Make me famous,Make them suffer,The march ahead,Memphis may fire,Mental Cruelty,Metallica,My autumn,Nasty,Nirvana,No face no case,Of buried hopes,Of mice & men,ORIGAMI,Our last night,Paleface,Rammstein,Recount,Secrets,Sepultura,Silverstein,Sleeping with sirens,Slipknot,Soulfly,Stigmata,The story so far,Suicide silence,Sum 41,Sumatra,System of a down,This Romantic Tragedy,Underoath,UnityTX,Waking the cadaver,We came as romans,Winds of plague,Yellowcard,Пошлая молли,Психея,СМЕХ";
        String[] arrBands100 = allbands.split(",");
        Scanner sc = new Scanner(System.in);
        String[] arrBands50 = new String[arrBands100.length/2];
        String[] arrBands25 = new String[arrBands50.length/2];
        String[] arrBands24 = new String[24];
        String[] arrBands12 = new String[12]; //ERROR
        String[] arrBands6 = new String[6];
        String[] arrBands3 = new String[3];
        String[] arrBands2 = new String[2];
        String favBand = "";
        String userInput = "";
        int index50 = 0;
        System.out.println("Готов узнать какая группа является для тебя номер 1?, впрочем выбора у тебя нет, приложение уже не остановить:)");
        System.out.println("Примерное время прохождения теста около 4 минут");
        System.out.println("Поехали!");
        for(int i = 0; i < arrBands50.length; i++){
            System.out.println(arrBands100[i] +" или "+ arrBands100[arrBands100.length-1-i]);
            System.out.println("Выберите 1 или 2");
            userInput = sc.next();
            if(Objects.equals(userInput, "1")){
                arrBands50[index50] = arrBands100[i];
                index50++;
            }else if(Objects.equals(userInput, "2")){
                arrBands50[index50] = arrBands100[arrBands100.length-1-i];
                index50++;
            }else{
                i--;
                System.out.println("Неплохая попытка, но к сожалению выбор только между 1 и 2 :)");
            }
        }
        System.out.println("Продолжаем...процесс познания себя иногда занимает не мало времени:)");
        int index25 = 0;
        for(int k = 0; k < arrBands25.length; k++){
            System.out.println(arrBands50[k] +" или "+ arrBands50[arrBands50.length-1-k]);
            System.out.println("Выберите 1 или 2");
            userInput = sc.next();
            if(Objects.equals(userInput, "1")){
                arrBands25[index25] = arrBands50[k];
                index25++;
            }else if(Objects.equals(userInput, "2")){
                arrBands25[index25] = arrBands50[arrBands50.length-1-k];
                index25++;
            }else{
                k--;
                System.out.println("Неплохая попытка, но к сожалению выбор только между 1 и 2 :)");
            }
        }
        System.out.println(Arrays.toString(arrBands25));
        while(true) {
            System.out.println(arrBands25[0] +" или "+ arrBands25[arrBands25.length-1]);
            System.out.println("Выберите 1 или 2");
            userInput = sc.next();
            if (Objects.equals(userInput, "1")) {
                for (int p = 0; p < arrBands24.length; p++) {
                    arrBands24[p] = arrBands25[p];
                }
                break;
            } else if (Objects.equals(userInput, "2")) {
                for (int p = 0; p < arrBands24.length; p++) {
                    arrBands24[p] = arrBands25[p + 1];
                }
                break;
            }else{
                System.out.println("Хватит ломать программу, нажимайте 1 либо 2:)");
            }
        }
        System.out.println(Arrays.toString(arrBands24));
        System.out.println("Чем дальше тем труднее предстоит выбор, но не останавливайся, ты практически у цели!");
        int index12 = 0;
        for(int n = 0; n < arrBands12.length;n++){
            System.out.println(arrBands24[n] +" или "+ arrBands24[arrBands24.length-1-n]);
            System.out.println("Выберите 1 или 2");
            userInput = sc.next();
            if(Objects.equals(userInput, "1")){
                arrBands12[index12] = arrBands24[n];
                index12++;
            }else if(Objects.equals(userInput, "2")){
                arrBands12[index12] = arrBands24[arrBands24.length-1-n];
                index12++;
            }else{
                n--;
                System.out.println("Неплохая попытка, но к сожалению выбор только между 1 и 2 :)");
            }
        }
        System.out.println(Arrays.toString(arrBands12));
        int index6 = 0;
        for(int m = 0; m < arrBands6.length;m++){
            System.out.println(arrBands12[m] +" или "+ arrBands12[arrBands12.length-1-m]);
            System.out.println("Выберите 1 или 2");
            userInput = sc.next();
            if(Objects.equals(userInput, "1")){
                arrBands6[index6] = arrBands12[m];
                index6++;
            }else if(Objects.equals(userInput, "2")){
                arrBands6[index6] = arrBands12[arrBands12.length-1-m];
                index6++;
            }else{
                m--;
                System.out.println("Неплохая попытка, но к сожалению выбор только между 1 и 2 :)");
            }
        }
        System.out.println(Arrays.toString(arrBands6));
        int index3 = 0;;
        for(int c = 0; c < arrBands3.length;c++){
            System.out.println(arrBands6[c] +" или "+ arrBands6[arrBands6.length-1-c]);
            System.out.println("Выберите 1 или 2");
            userInput = sc.next();
            if(Objects.equals(userInput, "1")){
                arrBands3[index3] = arrBands6[c];
                index3++;
            }else if(Objects.equals(userInput, "2")){
                arrBands3[index3] = arrBands6[arrBands6.length-1-c];
                index3++;
            }else{
                c--;
                System.out.println("Неплохая попытка, но к сожалению выбор только между 1 и 2 :)");
            }
        }
        System.out.println(Arrays.toString(arrBands3));
        int index2 = 0;
        while(true) {
            System.out.println(arrBands3[0] + " или " + arrBands3[arrBands3.length - 1]);
            System.out.println("Выберите 1 или 2");
            userInput = sc.next();
            if (Objects.equals(userInput, "1")) {
                for (int b = 0; b < arrBands2.length; b++) {
                    arrBands2[b] = arrBands3[b];
                }
                break;
            } else if (Objects.equals(userInput, "2")) {
                for (int x = 0; x < arrBands2.length; x++) {
                    arrBands2[x] = arrBands3[x + 1];
                }
                break;
            }else{
                System.out.println("Решил сломать напоследок?) Нажимайте 1 или 2!!!");
            }
        }
        System.out.println(Arrays.toString(arrBands2));
        while (true) {
            System.out.println(arrBands2[0] + " или " + arrBands2[arrBands2.length - 1]);
            System.out.println("Выберите 1 или 2");
            userInput = sc.next();
            if (Objects.equals(userInput, "1")) {
                favBand = arrBands2[0];
                break;
            } else if (Objects.equals(userInput, "2")) {
                favBand = arrBands2[arrBands2.length - 1];
                break;
            }else{
                System.out.println("Камон 1 или 2, либо 1 либо 2, третьего не дано)");
            }
        }

        System.out.println(".\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n");
        System.out.println("Твоя любимая группа: " + favBand);


    }
}
//121
