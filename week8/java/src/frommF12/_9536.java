import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _9536 {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int i, t = Integer.parseInt(in.readLine()), allSize, animalSize;
        while(t-->0){
            String animal[] = new String[100], tmp, fox[];
            StringTokenizer all = new StringTokenizer(in.readLine());
            allSize = all.countTokens();
            fox = new String[allSize];
            i = animalSize = 0;
            while(all.hasMoreTokens()) fox[i++] = all.nextToken();
            while(true){
                tmp = in.readLine();
                if(tmp.equals("what does the fox say?")) break;
                animal[animalSize++] = getSound(tmp);
            }
            System.out.println(cryFox(fox, animal, allSize, animalSize));
        }
        in.close();
    }
    private static String getSound(String tmp){ return tmp.substring(tmp.indexOf("goes")+5); }

    private static StringBuilder cryFox(String fox[], String animal[], int allSize, int animalSize){

