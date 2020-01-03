package xebia.assignment.salestaxcalculator.readers;

import java.util.List;

import xebia.assignment.salestaxcalculator.dtos.ArticleDto;

/**
 * This interface provides a structure for all kinds of Readers. The input can
 * be in XML, CSV, TXT file and it will accordingly process and provide a list
 * of articles present in the input.
 * 
 * @author gopal211292@gmail.com
 *
 */
public interface InputReader {

	/**
	 * Reads the file from the location and populates a list of Articles in the
	 * file.
	 * 
	 * @param filePath
	 * @return List<ArticleDto>
	 */
	public List<ArticleDto> read(String filePath);

}
