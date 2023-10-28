import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
/*
 * @Author  #TechieMit
 */
/* 1) Find all transactions having pen prices greater than 10 and sort them by ascending
 * 2)List the distinct prices of pens
 * 3) Sort the prices of pens in descending order
 * 4) Group all the pens having more than 1000 quantity
 * 5) Find any gel pen from the list
 * 6)  Find any parker pens from the list
 */
public class PensStreamAPIDemo {

	public static void main(String []s)
	{
		Pens pilotPens=new Pens("Pilot Pen","Roller Ball Pen");
		Pens reynoldsPens=new Pens("Reynolds Pen","Ball Point Pen");
		Pens fountainPens=new Pens("Parker Pen","Fountain Ink Pen");
		Pens uniBallsPens=new Pens("Uni Ball","Gel Pen");
		List<Pens> pensList=Arrays.asList(pilotPens,
				reynoldsPens,fountainPens,uniBallsPens
				);
		List<PenManufacturer> penManufacturer=Arrays.asList(
				new PenManufacturer(pilotPens, 160, 1000),
				new PenManufacturer(reynoldsPens, 8, 800),
				new PenManufacturer(fountainPens, 350, 700),
				new PenManufacturer(uniBallsPens, 170, 3000)
				);
		
		System.out.println("\nList of all Pen Names");
		
		List<String> getManuList=pensList.stream()
		.map(Pens::getPenName).distinct().collect(Collectors.toList());
		
		getManuList.forEach(System.out::println);
		System.out.println("\n List of all Pens having cost greater than 10");
		List<Integer> getPenPriceList=penManufacturer.stream().map(PenManufacturer::getCost)
				.filter(a->a>10).sorted()
				.collect(Collectors.toList());
		getPenPriceList.forEach(System.out::println);
		
		System.out.println("\nList of all Pens sorted in descending order");
		List<Integer> getPenPriceListDesc=penManufacturer.stream().map(PenManufacturer::getCost)
				.sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		getPenPriceListDesc.forEach(System.out::println);
		
		System.out.println("\nList of all Pens having more than 1000 quantity");
		List<Integer> getMorethanThousand=penManufacturer.stream()
				.map(PenManufacturer::getQuantity).filter(b->b>1000)
				.collect(Collectors.toList());
		getMorethanThousand.forEach(System.out::println);
		
		//We also have noneMatch
		boolean isGelPen=pensList.stream().anyMatch(a->a.getPenType().equalsIgnoreCase("Gel Pen"));
		
		System.out.println("\nDo we have gel pen in the list? "+isGelPen);
		//Likewise we have findfirst
		Optional<Pens> getPenName=pensList.stream().filter(a->a.getPenName().equalsIgnoreCase("Parker pen")
				).findAny();
		if(getPenName.isPresent())
		{
			System.out.println("\nThe pen Name is::"+getPenName.get());
		}
		
		
	}
}
