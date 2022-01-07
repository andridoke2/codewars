import helper.Contact;

public class App {

    private static final double DELTA = 1e-15;

    /**
     * Judul : Multiplication table for number
     * Soal :  Tujuan Anda adalah mengembalikan tabel perkalian untuk angka yang selalu berupa bilangan bulat dari 1 hingga 10.
     *         Sebagai contoh, tabel perkalian (string) untuk angka == 5 terlihat seperti di bawah ini:
     * 1 * 5 = 5
     * 2 * 5 = 10
     * 3 * 5 = 15
     * 4 * 5 = 20
     * 5 * 5 = 25
     * 6 * 5 = 30
     * 7 * 5 = 35
     * 8 * 5 = 40
     * 9 * 5 = 45
     * 10 * 5 = 50
     * P. S. Anda dapat menggunakan \n dalam string untuk melompat ke baris berikutnya.
     * Catatan: baris baru harus ditambahkan di antara baris, tetapi tidak boleh ada baris baru di akhir.
     * @param num
     * @return
     */
    public static String multiTable(int num){
        String result = "";
        String temp = "";
        for(int i = 1; i <= 10; i++){
            temp = i * num + "";
            if(i != 10){
                result = result + i + " * " + num + " = " + temp + "\n";
            } else {
                result = result + i + " * " + num + " = " + temp;
            }
        }
        return result;
    }

    /**
     * Testing & Main Multi Table
     */
    public static void mainMultiTable(){
        System.out.println("1 * 5 = 5\n2 * 5 = 10\n3 * 5 = 15\n4 * 5 = 20\n5 * 5 = 25\n6 * 5 = 30\n7 * 5 = 35\n8 * 5 = 40\n9 * 5 = 45\n10 * 5 = 50");
        System.out.println(multiTable(5));
        System.out.println("======================================================================");
        System.out.println("1 * 1 = 1\n2 * 1 = 2\n3 * 1 = 3\n4 * 1 = 4\n5 * 1 = 5\n6 * 1 = 6\n7 * 1 = 7\n8 * 1 = 8\n9 * 1 = 9\n10 * 1 = 10");
        System.out.println(multiTable(1));
    }

    /**
     * The Wide-Mouthed frog!
     * --------------------------------
     * Katak bermulut lebar sangat tertarik pada kebiasaan makan makhluk lain.
     * Dia tidak bisa berhenti bertanya kepada makhluk yang dia temui apa yang mereka suka makan. Tapi, kemudian dia bertemu dengan buaya yang suka makan katak bermulut lebar!
     * Ketika dia bertemu buaya, itu kemudian membuat mulut kecil.
     * Tujuan Anda dalam kata ini adalah untuk menyelesaikan metode mouth_size metode ini mengambil satu hewan argumen yang sesuai dengan hewan yang ditemui oleh katak. 
     * Jika yang ini adalah buaya (tidak peka huruf besar/kecil) kembalikan kecil jika tidak kembali lebar
     * 
     * @param animal
     * @return
     */
    public static String mouthSize(String animal){
        String result = "";
        if(animal.equals("alligator") || animal.toUpperCase().equals("ALLIGATOR")){
            result = "small";
        } else {
            result = "wide";
        }
        return result;
        /**
         *  satu baris
         * return "alligator".equals(animal.toLowerCase()) ? "small" : "wide";
         */
    }

    /**
     * Testing & Main Mouth Size
     */
    public static void mainMouthSize(){
        System.out.print("wide | ");
        System.out.println(mouthSize("touchan"));
        System.out.print("wide | ");
        System.out.println(mouthSize("ant bear"));
        System.out.print("small | ");
        System.out.println(mouthSize("alligator"));
    }

    /**
     * Convert number to reversed array of digits
     * Ubah angka menjadi array digit terbalik
     * Diberikan nomor non-negatif acak, Anda harus mengembalikan digit nomor ini dalam array dalam urutan terbalik.
     * @param n
     * @return
     */
    public static int[] digitize(long n){
        int[] result = new int[5];
        for(int i = 0; i < result.length; i++){
            result[i] = (int)n;
        }
        return result;
    }

    public static void mainDigitize(){
			int[] res = digitize(12345);
			for(int i = 0; i < res.length; i++){
				System.out.println(res[i] + " ");
			}
    }

    /**
     * Judul : Thinkful - Logic Drills: Traffic light
     * Anda sedang menulis kode untuk mengontrol lampu lalu lintas kota Anda. 
     * Anda memerlukan fungsi untuk menangani setiap perubahan dari hijau, kuning, merah, dan kemudian hijau lagi.
     * Selesaikan fungsi yang mengambil string sebagai argumen yang mewakili status lampu saat ini dan mengembalikan string yang mewakili status lampu yang harus diubah.
     * Misalnya, update_light('hijau') harus mengembalikan 'kuning'.
     * Catatan: Gunakan "" sebagai ganti '' di C++.
     * 
     * @param current
     * @return
     */
    public static String updateLight(String current){
			String result = "";
			switch(current){
				case "red":
					result = "green";
					break;
				case "green":
					result = "yellow";
					break;
				case "yellow":
					result = "red";
					break;
				default:
					result = "not found";
					break;
			}
			return result;
    }

    public static void mainUpdateLight(){
        System.out.print("red | ");
        System.out.println(updateLight("green"));
        System.out.print("green | ");
        System.out.println(updateLight("yellow"));
        System.out.print("yellow | ");
        System.out.println(updateLight("red"));
    }

		/**
		 * Convert boolean to String
		 * @param b
		 * @return
		 */
    public static String convert(boolean b){
			// if(b == true) {
			// 	return "true";
			// } else {
			// 	return "false";
			// }
			return b == true ? "true" : "false";
		}

		/**
		 * Complete the function which converts hex number (given as a string) to a decimal number.
		 * @param hexString
		 * @return
		 */
		public static int hexToDec(final String hexString) {
			int result = Integer.parseInt(hexString, 16);
			return result;
		}
    
    /**
     * Buat fungsi yang menggunakan bilangan bulat sebagai argument dan mengembalikan "Genap"
     * untuk angka genap atau "Ganjil" untuk angka ganjil.
     * 
     * @param number
     * @return
     */
    public static String evenOrOdd(int number){
        return number % 2 == 0 ? "Even" : "Odd";
    }
    
    /**
     * Welcome. In this kata, you are asked to square every digit of a number and concatenate them.
     * For example, if we run 9119 through the function, 811181 will come out, because 9 pangkat 2 is 81 and 1 pangkat 2 is 1.
     * Note: The function accepts an integer and returns an integer
     * @param n
     * @return
     * Catatan : karena fungsi static maka tidak bisa berubah.
     * harus dibuat pada kelas lain.
     */
    public static int squareDigits(int n) {
        while(n > 0){
            System.out.print(n % 10);
            n = n / 10;
        }
        return n;
    }

    public static void mainSqureDigits(){
        int hasil = squareDigits(9119);
        System.out.print(hasil);
    }

    /**
     * Write a function which converts the input string to uppercase.
     */
    public static String MakeUpperCase(String str){
        return str.toUpperCase();
    }
    /*
    Author : nhuallpa
    Source : https://www.codewars.com/kata/57a0556c7cb1f31ab3000ad7/solutions/java
        1.  public static String MakeUpperCase(String str){
                StringBuffer s = new StringBuffer();
                int Anumber = 97;
                int Znumber = 122;
                int len = str.length();
                int i=0;
                for (i=0; i<len; i++) {
                int asciiNumber = (int)str.charAt(i);
                int asciiNumberUpper = asciiNumber;
                if (asciiNumber>=Anumber && asciiNumber<=Znumber) {
                    asciiNumberUpper = asciiNumber - 32;
                }
                s.append((char)asciiNumberUpper);
                }
                return s.toString();
            }
    Author : MachoAlpha01
    Source : https://www.codewars.com/kata/57a0556c7cb1f31ab3000ad7/solutions/java
        2.  public static String MakeUpperCase(String str){
                char[] sc = str.toCharArray();
                String s = "";
                for(char c:sc){
                s+=Character.toUpperCase(c);
                }
                return s;
            }
    */

    /**
     * Complete the function that takes two integers (a, b, where a < b) and return an 
     * array of all integers between the input parameters, including them.
     * For example:
     * a = 1
     * b = 4
     * --> [1, 2, 3, 4]
     */
    public static int[] between(int a, int b) {
        int[] result = new int[b - a];
        for(int i = a; i <= b; i++){
            result[i] = i;
            i = result[i];
        }
        return result;
    }

    public static void mainBetween(){
        // for(int i = 0; i < between(5, 10).length; i++){
        //     System.out.print(i + " ");
        // }
        for(int nilai = 10; nilai >= 5; nilai--){
            System.out.print(nilai + " ");
        }
    }

    public static int stringToNumber(String str){
        return Integer.parseInt(str);
    }

    /**
     * Tulis fungsi yang menghitung rata-rata angka dalam daftar yang diberikan.
     * Catatan: Array kosong harus mengembalikan 0.
     */
    public static double find_average(int[] array){
        double result = 0;
        for(int i = 0; i < array.length; i++){
            if(array.length <= 0){
                return 0;
            }
            result = result + array[i]; 
        }
        result = result / array.length;
        return result;
    }

    /**
     * Write a function called repeatStr which repeats the given string string exactly n times.
     * @param repeat
     * @param string
     * @return
     */
    public static String repeatStr(final int repeat, final String string) {
        
        /**
         * cara manual.
         * authors : mohic, Pavel696, jcys, michal90r, nesseb, linlux, JCorwin, 1amobot, remdigga4237, seantitus (plus 416 more warriors)
         * 
        
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < repeat; i++) {
            sb.append(string);
        }

        return sb.toString();

        */

        return string.repeat(repeat);
    }

    public static String dnaToRna(String dna){
        String[] huruf = dna.split("");
        /**
         * link soal : https://www.codewars.com/kata/5556282156230d0e5e000089/train/java
         * status : belum selesai
         */
        String result = "";
        return result;
    }

    /**
     * ----- Main Function -----
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) {
        System.out.println(dnaToRna("UU"));
    }
}
