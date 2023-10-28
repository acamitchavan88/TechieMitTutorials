import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/*
 *  @Author #TechieMit
 *  StreamAPIDemo
 */
public class StreamAPIDemo {

	public static void main(String[] args) {
		List<Boxes> boxesList=Arrays.asList(
				new Boxes("Monitor Boxes","Brown",800,true),
				new Boxes("CPU Boxes","Yellow",1800,true),
				new Boxes("Mouse Boxes","Green",400,false),
				new Boxes("Speaker boxes","Green",600,false),
				new Boxes("Headphone Boxes","Brown",800,true)
				);
		//Stream to get Brown Boxes
		System.out.println("List of Brown Boxes");
		List<String> getBrownBoxes=boxesList.stream().
				filter(a->a.getColor().equalsIgnoreCase("Brown"))//Intermediate Operation
				.map(Boxes::getName)//Intermediate Operation
				.collect(Collectors.toList()); //Terminal Operation

		System.out.println(getBrownBoxes);

		System.out.println("\n");
		List<Integer> getWeigtedBoxes=boxesList.stream().
				filter(a->a.getWeight()>600).distinct()
				.map(Boxes::getWeight).collect(Collectors.toList());
		//Terminal Operation
		getWeigtedBoxes.forEach(System.out::println);
		System.out.println("\n");

		System.out.println("List of Empty Boxes");
		List<Boolean> getEmptyBoxesList=boxesList.stream().
				filter(a->a.isBox_filled()==false).map(Boxes::isBox_filled).
				collect(Collectors.toList());
		
		Long getEmptyBoxesCount=getEmptyBoxesList.stream().count();
		//Terminal Operation
		System.out.println("Total empty boxes  are::"+getEmptyBoxesCount);
		
		List<Boolean> getFilledBoxesList=boxesList.stream().
				filter(a->a.isBox_filled()==true).map(Boxes::isBox_filled).
				collect(Collectors.toList());
		
		Long getFilledBoxesCount=getFilledBoxesList.stream().count();
		System.out.println("Total filled boxes  are::"+getFilledBoxesCount);
	}

}
