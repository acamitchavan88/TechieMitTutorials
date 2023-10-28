import java.util.Optional;

/*
 * @Author #TechieMit
 */
public class OptionalContinued {

	public static void main(String[] args) {
		//Empty method in Optional
		Optional<Integer> optionalVar=Optional.ofNullable(14);

		System.out.println("The optional value for orElse ::"+optionalVar.orElse(100));

		//OrElse Method in Optional
		String nullName="Strings are immutable";
		String nameValue=Optional.ofNullable(nullName).orElseThrow(IllegalStateException::new);
		System.out.println("The optional name value in orElseThrows is::"+nameValue);

		//OrElseGet Method
		Optional<Integer> optionalGet=Optional.empty();
		System.out.println("Using Optional Value by orElseGet"
				+ "(Supplier) method: "
				+ optionalGet.orElseGet(
						() -> (int)(Math.random()*123)));
	}

}
