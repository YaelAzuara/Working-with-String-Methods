public class StringBuilderLab {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("StringBuilder Lab");

        
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
