package project.pickme.notice.domain;

import java.time.LocalDateTime;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import project.pickme.user.domain.Customs;

@Data
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
public class Notice {
	private Long id;
	private String title;
	private String content;
	private LocalDateTime createTime;
	private Customs customs;

	public void updateContent(String content) {
		this.content = content;
	}

	public void updateTitle(String title) {
		this.title = title;
	}
}
