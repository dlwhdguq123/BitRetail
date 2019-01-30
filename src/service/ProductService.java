package service;

import java.util.List;
import domain.ProductDTO;

public interface ProductService {
	public void registProduct(ProductDTO pro);
	public List<ProductDTO> bringProductList(); 
	public List<ProductDTO> retrieveProduct(String searchWord);
	public ProductDTO retrieveProducts(String searchWord);
	public int countProduct();
	public boolean existsProduct(String searchword);
	public void modifyProduct(ProductDTO pro);
	public void removeProduct(ProductDTO pro);
}
