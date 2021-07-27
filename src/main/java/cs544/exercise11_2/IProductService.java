package cs544.exercise11_2;

import org.springframework.stereotype.Component;

@Component
public interface IProductService {
	public Product getProduct(int productNumber);

	public int getNumberInStock(int productNumber);
}
