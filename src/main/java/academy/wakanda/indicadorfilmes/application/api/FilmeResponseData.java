package academy.wakanda.indicadorfilmes.application.api;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@NoArgsConstructor(access = AccessLevel.PACKAGE)
@ToString
public class FilmeResponseData {
	
	private List<FilmeResponse> results;

	@Getter
	@ToString
	public static class FilmeResponse {

		@JsonProperty("id")
		private int id;

		@JsonProperty("original_title")
		private String originalTitle;

		@JsonProperty("title")
		private String title;

		@JsonProperty("overview")
		private String overview;

		@JsonProperty("release_date")
		private String releaseDate;

		@JsonProperty("vote_average")
		private double voteAverage;

		@JsonProperty("vote_count")
		private int voteCount;
	}
}