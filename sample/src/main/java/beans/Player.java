package beans;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;

// lombokを利用してsetter/getter、コンストラクタの記述を省略
@Data @AllArgsConstructor
public class Player {
	private final int id;
	private int country_id;
	private int uniform_num;
	private String position;
	private String name;
	private String club;
	private LocalDate birth;
	private int height;
	private int weight;
}
