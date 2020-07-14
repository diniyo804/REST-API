package kr.co.fastcampus.eatgo.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RestaurantTest {
/*
  [꿀팁]
   spring boot 실행 도중 수정한 코드를 적용 시키고 싶다면 tdd를 실행해라 !
   수정된 부분이 빌드 되어 적용됨.
*/

    @Test
    public void creation() {
        Restaurant restaurant = new Restaurant("Bob zip", "Seoul");
        assertThat(restaurant.getName()).isEqualTo("Bob zip");
        assertThat(restaurant.getAdress()).isEqualTo("Seoul");
    }

    @Test
    public void information() {
        Restaurant restaurant = new Restaurant("Bob zip", "Seoul");
        assertThat(restaurant.getInformation()).isEqualTo("Bob zip in Seoul");

    }

}