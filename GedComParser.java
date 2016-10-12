import java.io.File;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class GedComParser {	
	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
		System.out.print("Provide filepath : ");
		File file = new File(input.nextLine());
		input.close();
		
		Set<String> eligibleTags = getEligibleTags();
		input = new Scanner(file);
		while (input.hasNextLine()) {
            String line = input.nextLine();
            System.out.println("line:\t" + line);
            
            String[] lineArr = line.split(" ");
            String level = lineArr[0];
            System.out.println("level:\t" + level);
            
            String tagName = lineArr[1];
            if(level.equals("0") && tagName.startsWith("@")) {
            	tagName = lineArr[2];
            }
    		tagName = eligibleTags.contains(tagName) ? tagName : "Invalid tag";
            System.out.println("tag:\t" + tagName);
            System.out.println();
        }
		input.close();
		System.out.println("End of parsing");
	}
		
	private static Set<String> getEligibleTags() throws Exception {
		Set<String> tags = new HashSet<>();
		Scanner i = new Scanner(new File("tags.txt"));
		while(i.hasNextLine()) {
			tags.add(i.nextLine());
		}
		i.close();
		return tags;
	}
}
