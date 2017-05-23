package com.talaria.controller.product;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonView;
import com.talaria.model.ProductVO;
import com.talaria.model.TsviewimageVO;
import com.talaria.model.View;
import com.talaria.service.SampleService;

@RestController
@RequestMapping("/v1/products")
public class ProductController {

	private static final Logger logger = LoggerFactory.getLogger(ProductController.class);

	@Autowired
	private SampleService sampleService;

	/**
	 * GET /v1/products/:productno
	 * 
	 * @param productno
	 * @return
	 *
	 */

	@RequestMapping(value = "/{productno}", method = RequestMethod.GET, produces = "application/json")
	public ProductVO getProduct(@PathVariable int productno) {
		logger.debug("GET Product ::::::::::::::::::::::::::::::::::::::::::::::: " + productno);
		ProductVO pvo = new ProductVO();
		pvo.setProductId(productno);
		logger.debug("GET Product ::::::::::::::::::::::::::::::::::::::::::::::: " + pvo.getProductId());
		return pvo;
	}

	/**
	 * GET /v1/products/:productno/add-detail
	 * 
	 * @param productno
	 * @return
	 * 
	 */
	@RequestMapping(value = "/{productno}/add-detail", method = RequestMethod.GET, produces = "application/json")
	public ProductVO getProductDetail(@PathVariable int productno) {
		logger.debug("GET Product Detail ::::::::::::::::::::::::::::::::::::::::::::::: " + productno);
		ProductVO pvo = new ProductVO();
		pvo.setProductId(productno);
		logger.debug("GET Product ::::::::::::::::::::::::::::::::::::::::::::::: " + pvo.getProductId());
		return pvo;
	}
	
	/**
	 * GET /v1/products/:productno/options
	 * 
	 * @param productno
	 * @return
	 * 
	 */
	@RequestMapping(value = "/{productno}/options", method = RequestMethod.GET, produces = "application/json")
	public ProductVO getProductOption(@PathVariable int productno) {
		logger.debug("getProductOption ::::::::::::::::::::::::::::::::::::::::::::::: " + productno);
		ProductVO pvo = new ProductVO();
		pvo.setProductId(productno);
		logger.debug("getProductOption ::::::::::::::::::::::::::::::::::::::::::::::: " + pvo.getProductId());
		return pvo;
	}

	/**
	 * GET /v1/products/:productno/truestyle
	 * 
	 * @param productno
	 * @return
	 * 
	 */
	@RequestMapping(value = "/{productno}/truestyle", method = RequestMethod.GET, produces = "application/json")
	public ProductVO getProductTrueStyle(@PathVariable int productno) {
		logger.debug("getProductTrueStyle ::::::::::::::::::::::::::::::::::::::::::::::: " + productno);
		ProductVO pvo = new ProductVO();
		pvo.setProductId(productno);
		logger.debug("getProductTrueStyle ::::::::::::::::::::::::::::::::::::::::::::::: " + pvo.getProductId());
		return pvo;
	}
	
	/**
	 * POST /v1/products/:productno/truestyle
	 * 
	 * @param productno
	 * @return
	 * 
	 */
	@RequestMapping(value = "/{productno}/truestyle", method = RequestMethod.POST, produces = "application/json")
	public TsviewimageVO postProductTrueStyle(@RequestBody TsviewimageVO vo) {
		logger.debug("getProductTrueStyle ::::::::::::::::::::::::::::::::::::::::::::::: "+vo);
		
		logger.debug("getProductTrueStyle ::::::::::::::::::::::::::::::::::::::::::::::: ");
		return vo;
	}
	
	
	

	
}
