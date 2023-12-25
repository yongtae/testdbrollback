package dbunit;

import java.io.Serializable;
import java.util.Date;

import org.springframework.stereotype.Repository;

/**
 * @Class Name : NoticeVo.java
 * @Description : NoticeVo class
 * @Modification Information
 * <pre>
 *   수정일         수정자                   수정내용
 *  -------    --------    ---------------------------
 *   2009.04.02  최은봉          최초 생성
 * </pre>
 * 
 * @author 개발환경 개발팀 최은봉
 * @since 2009. 04. 02
 * @version 1.0
 * 
 * @Copyright (C) 2008 by MOPAS  All right reserved.
 */
@Repository("noticeVo")
public class NoticeVo implements Serializable {

	private static final long serialVersionUID = 1L;
	
	/** id */
	private int id;
	
	/** title */
	private String title;
	
	/** contents */
	private String contents;
	
	/** registrationDate */
	private Date registrationDate;
	
	/** lastModifier */
	private String lastModifier;
	
	/** lastModifiedDate */
	private Date lastModifiedDate;
	
	/** fileCnt */
	private int fileCnt;
	
	/** retrievedCnt */
	private int retrievedCnt;
	
	/**
	 * getId
	 * @return
	*/
	public int getId() {
		return id;
	}

	/**
	 * getTitle
	 * @return
	*/
	public String getTitle() {
		return title;
	}

	/**
	 * getContents
	 * @return
	*/
	public String getContents() {
		return contents;
	}

	/**
	 * getRegistrationDate
	 * @return
	*/
	public Date getRegistrationDate() {
		return registrationDate;
	}

	/**
	 * getLastModifier
	 * @return
	*/
	public String getLastModifier() {
		return lastModifier;
	}

	/**
	 * getLastModifiedDate
	 * @return
	*/
	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}

	/**
	 * getFileCnt
	 * @return
	*/
	public int getFileCnt() {
		return fileCnt;
	}

	/**
	 * getRetrievedCnt
	 * @return
	*/
	public int getRetrievedCnt() {
		return retrievedCnt;
	}

	/**
	 * setId
	 * @param id
	*/
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * setTitle
	 * @param title
	*/
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * setContents
	 * @param contents
	*/
	public void setContents(String contents) {
		this.contents = contents;
	}

	/**
	 * setRegistrationDate
	 * @param registrationDate
	*/
	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

	/**
	 * setLastModifier
	 * @param lastModifier
	*/
	public void setLastModifier(String lastModifier) {
		this.lastModifier = lastModifier;
	}

	/**
	 * setLastModifiedDate
	 * @param lastModifiedDate
	*/
	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	/**
	 * setFileCnt
	 * @param fileCnt
	*/
	public void setFileCnt(int fileCnt) {
		this.fileCnt = fileCnt;
	}

	/**
	 * setRetrievedCnt
	 * @param retrievedCnt
	*/
	public void setRetrievedCnt(int retrievedCnt) {
		this.retrievedCnt = retrievedCnt;
	}
	
}
