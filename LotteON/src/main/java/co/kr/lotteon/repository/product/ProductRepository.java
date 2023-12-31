package co.kr.lotteon.repository.product;

import co.kr.lotteon.entity.product.ProdCate1Entity;
import co.kr.lotteon.entity.product.ProductEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {


    //////////////////////////////
    ////////    product list 출력
    //////////////////////////////
    /////// 기본 리스트 출력
    public Page<ProductEntity> findByProdCate1AndProdCate2AndStockGreaterThanEqualAndSaleEquals(
            ProdCate1Entity cate1, int cate2, int stock, int sale, Pageable pageable
    );
    /////// 판매 많은 순
    public Page<ProductEntity> findByProdCate1AndProdCate2AndStockGreaterThanEqualAndSaleEqualsOrderBySoldDesc(
            ProdCate1Entity cate1, int cate2, int stock, int sale, Pageable pageable
    );
    /////// 낮은 가격 순
    public Page<ProductEntity> findByProdCate1AndProdCate2AndStockGreaterThanEqualAndSaleEqualsOrderByPriceAsc(
            ProdCate1Entity cate1, int cate2, int stock, int sale, Pageable pageable
    );
    /////// 높은 가격 순
    public Page<ProductEntity> findByProdCate1AndProdCate2AndStockGreaterThanEqualAndSaleEqualsOrderByPriceDesc(
            ProdCate1Entity cate1, int cate2, int stock, int sale, Pageable pageable
    );
    /////// 평점 높은 순
    public Page<ProductEntity> findByProdCate1AndProdCate2AndStockGreaterThanEqualAndSaleEqualsOrderByScoreDesc(
            ProdCate1Entity cate1, int cate2, int stock, int sale, Pageable pageable
    );
    /////// 후기 많은 순
    public Page<ProductEntity> findByProdCate1AndProdCate2AndStockGreaterThanEqualAndSaleEqualsOrderByReviewDesc(
            ProdCate1Entity cate1, int cate2, int stock, int sale, Pageable pageable
    );
    /////// 최근 등록 순
    public Page<ProductEntity> findByProdCate1AndProdCate2AndStockGreaterThanEqualAndSaleEqualsOrderByRdateAsc(
            ProdCate1Entity cate1, int cate2, int stock, int sale, Pageable pageable
    );

    /////// 히트 상품
    public Page<ProductEntity> findByStockGreaterThanEqualAndSaleEqualsOrderByHitDesc(
            int stock, int sale, Pageable pageable
    );
    /////// 추천 상품
    public Page<ProductEntity> findByStockGreaterThanEqualAndSaleEqualsOrderByScoreDesc(
            int stock, int sale, Pageable pageable
    );
    /////// 최신 상품
    public Page<ProductEntity> findByStockGreaterThanEqualAndSaleEqualsOrderByRdateAsc(
            int stock, int sale, Pageable pageable
    );
    /////// 인기 상품
    public Page<ProductEntity> findByStockGreaterThanEqualAndSaleEqualsOrderBySoldDesc(
            int stock, int sale, Pageable pageable
    );
    /////// 할인 상품
    public Page<ProductEntity> findByStockGreaterThanEqualAndSaleEqualsOrderByDiscountDesc(
            int stock, int sale, Pageable pageable
    );


    //////////////////////////////
    ////////    product view 출력
    //////////////////////////////

    /*public ProductEntity findByProdNo();*/

    /*@Modifying(clearAutomatically = true)
    @Query("update km_product p set p.hit = p.hit + 1 where p.prodNo = :prodNo")
    public void incrementHitCountByProdNo(int prodNo);*/
    // return 배포 할 때 / 넣기로

    /*@Query("SELECT p FROM ProductEntity p WHERE p.prodName LIKE %:keyword%")*/
    public Page<ProductEntity> findByProdNameContainingAndProdCate1EqualsAndSaleEquals(String keyword, int prodCate1, int sale,Pageable pageable);
    public Page<ProductEntity> findByProdNameContainingAndProdCate1EqualsAndSaleEqualsOrderBySoldDesc(String keyword, int prodCate1, int sale,Pageable pageable);
    public Page<ProductEntity> findByProdNameContainingAndProdCate1EqualsAndSaleEqualsOrderByPriceAsc(String keyword, int prodCate1, int sale,Pageable pageable);
    public Page<ProductEntity> findByProdNameContainingAndProdCate1EqualsAndSaleEqualsOrderByPriceDesc(String keyword, int prodCate1, int sale,Pageable pageable);
    public Page<ProductEntity> findByProdNameContainingAndProdCate1EqualsAndSaleEqualsOrderByScoreDesc(String keyword, int prodCate1, int sale,Pageable pageable);
    public Page<ProductEntity> findByProdNameContainingAndProdCate1EqualsAndSaleEqualsOrderByReviewDesc(String keyword, int prodCate1, int sale,Pageable pageable);
    public Page<ProductEntity> findByProdNameContainingAndProdCate1EqualsAndSaleEqualsOrderByRdateAsc(String keyword, int prodCate1, int sale,Pageable pageable);
    public Page<ProductEntity> findByProdNameContainingAndSaleEquals(String keyword, int sale,Pageable pageable);
    public Page<ProductEntity> findByProdNameContainingAndSaleEqualsOrderBySoldDesc(String keyword, int sale,Pageable pageable);
    public Page<ProductEntity> findByProdNameContainingAndSaleEqualsOrderByPriceAsc(String keyword, int sale,Pageable pageable);
    public Page<ProductEntity> findByProdNameContainingAndSaleEqualsOrderByPriceDesc(String keyword, int sale,Pageable pageable);
    public Page<ProductEntity> findByProdNameContainingAndSaleEqualsOrderByScoreDesc(String keyword, int sale,Pageable pageable);
    public Page<ProductEntity> findByProdNameContainingAndSaleEqualsOrderByReviewDesc(String keyword, int sale,Pageable pageable);
    public Page<ProductEntity> findByProdNameContainingAndSaleEqualsOrderByRdateAsc(String keyword, int sale,Pageable pageable);

}
