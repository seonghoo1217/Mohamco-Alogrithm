public class _4959 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String password = "start";

        while (!password.equals("end")) {
            password = br.readLine();
            char[] pwChars = password.toCharArray();

            boolean haveVowel = false;
            boolean continuousConsonant = false;
            boolean continuousVowel = false;
            int continuousVowelCount=0;
            int continuousConsonantCount=0;
            char pre ='.';
            for (int i = 0; i < pwChars.length; i++) {
                char pwChar = pwChars[i];
                if (checkVowel(pwChar)) {
                    haveVowel = true;
                    continuousConsonantCount = 0;
                    continuousVowelCount++;
                    if (continuousVowelCount == 3) {
                        notAcceptPrint(password);
                        break;
                    }
                } else {
                    continuousVowelCount = 0;
                    continuousConsonantCount++;
                    if (continuousConsonantCount == 3) {
                        notAcceptPrint(password);
                        break;

