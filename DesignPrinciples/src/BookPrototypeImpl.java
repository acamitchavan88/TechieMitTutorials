import java.util.ArrayList;
import java.util.List;

public class BookPrototypeImpl implements PrototypeInt{
	//Attributes bookNames and its publishers
	private String bookNames;
	private List<String>bookPublishers;
	public List<String> getBookPublishers() {
		return bookPublishers;
	}


	public void setBookPublishers(List<String> bookPublishers) {
		this.bookPublishers = bookPublishers;
	}


	@Override
	public String toString() {
		return "BookPrototypeImpl [bookNames=" + bookNames + ", bookPublishers=" + bookPublishers + "]";
	}


	public BookPrototypeImpl(String bookNames, List<String> bookPublishers) {
		super();
		this.bookNames = bookNames;
		this.bookPublishers = bookPublishers;
	}
	
	
	@Override
	public BookPrototypeImpl clone()
	{
		List<String> clonedPublishers=new ArrayList<>(this.bookPublishers);
		return new BookPrototypeImpl(bookNames, clonedPublishers);
	}
}
