public class StringBufferLab {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Multithreading Lab");

        
        sb.append(" - Learning Java");
        System.out.println("After append: " + sb);

        
        int indexAfterLab = sb.indexOf("Lab") + "Lab".length();
        sb.insert(indexAfterLab, " is fun");
        System.out.println("After insert: " + sb);

        
        int startLearning = sb.indexOf("Learning");
        int endLearning = startLearning + "Learning".length();
        if (startLearning != -1) {
            sb.delete(startLearning, endLearning);
        }
        System.out.println("After delete: " + sb);

        
        sb.reverse();
        System.out.println("After reverse: " + sb);
    }
}
