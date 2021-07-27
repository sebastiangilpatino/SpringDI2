package cs544.exercise11_2;

import org.springframework.stereotype.Component;

@Component
public interface IInventoryService {
	public int getNumberInStock(int productNumber);

}
