package org.blueissac.domain;

import lombok.Data;
import lombok.ToString;

//@Getter
//@Setter
//@ToString
//public class SampleVO {
//	
//	private String val1;
//	private String val2;
//	private String val3;
//}

// @Data는 getter/setter 뿐만 아니라 equals(), hashCode(), toString(), 파라미터 없는 기본 생성자까지 자동 생성해줌
// @Data가 toString()을 만들어주기 때문에 SampleVO를 출력시 변수가 출력이 되는데, 특정 변수는 출력 되지 않게 하려면 
// @toString에 exclude 속성을 넣으면 됨
@Data
@ToString(exclude={"val3"})
public class SampleVO {
	
	private String val1;
	private String val2;
	private String val3;
}
