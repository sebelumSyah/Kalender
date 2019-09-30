
package kalender;
import java.util.Scanner;

public class Kalender {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] kalender = new int [6][7];
        int tahun, ta, ts, bulan, hari, hari1, tgl, kolom, x, hasil = 0;
        hari1 = 0;
        hari = 0;
        ta = 1;
        kolom = 6;
        bulan = 0;
        System.out.print("Masukkan Tahun : ");
        tahun = input.nextInt();
        int[] kabisat = {366,31,29,31,30,31,30,31,31,30,31,30};
        int[] notKabisat = {365,31,28,31,30,31,30,31,31,30,31,30};
        ts = tahun - ta;
        for(int i = 0; i<ts; i++){
            if((i+ta)%4==0){
                hasil += kabisat[0];
            }
            else {
                hasil += notKabisat[0];
            }
        }
        System.out.print("Masukkan Bulan : ");
        bulan = input.nextInt();
        System.out.println("");
        if (tahun%4!=0){
            for(int i = 1;i<bulan;i++){
                hasil+=notKabisat[i];
            }
        }
        else {
            for(int i = 1;i<bulan;i++){
                hasil+=kabisat[i];
            }
        }
        hasil+=kolom;
        kolom = hasil%7;
        switch(bulan){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12 : hari = 31;
            break;
            case 4: case 6: case 9: case 11: hari = 30;
            break;
            case 2: if(tahun%4!=0)
                        hari = 28;
            else
                hari =29;
            break;
            default: System.out.println("Masukkan salah!!");
            return;
        }
        switch(bulan - 1){
            case 1: case 3: case 5: case 7: case 8: case 10: case 0 : hari1 = 31;
            break;
            case 4: case 6: case 9: case 11: hari1 = 30;
            break;
            case 2: if(tahun%4!=0)
                        hari1 = 28;
            else
                hari1 =29;
            break;
        }
        tgl = 1;
        x=0;
        if(kolom!=0)
            tgl = hari1-kolom+1;

        System.out.println("sen \tsel\trab\tkam\tjum\tsab\tmin");
        for(int i = 0;i<6;i++){
            l:
            for(int j = 0;j<7;j++){
                
                while(x<kolom){
                    kalender[i][j] = tgl;
                    tgl+=1;
                    System.out.print(" " + kalender[i][j] + "\t");
                    x+=1;
                    if (tgl>hari1)
                        tgl = 1;
                    continue l;
                }
                kalender[i][j] = tgl;
                tgl+=1;
                if (tgl>hari)
                    tgl = 1;
                System.out.print(" " + kalender[i][j] + "\t");
            } 
            System.out.println("");

        }
    }

}

    
    

