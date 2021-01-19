package kon.legendarystatsserver.model.game;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * A set of the game.
 */
@Entity
public class Set {
	/** Database ID */
	@Id
	private Integer id;

	/** The name of the set for Marvel comics sets */
	private String marvelName;

	/** The name of the set for Marvel movie stills sets */
	private String mcuName;

	/** The name of the set for Legendary DXP sets */
	private String dxpName;

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @return the marvelName
	 */
	public String getMarvelName() {
		return marvelName;
	}

	/**
	 * @return the mcuName
	 */
	public String getMcuName() {
		return mcuName;
	}

	/**
	 * @return the dxpName
	 */
	public String getDxpName() {
		return dxpName;
	}

}
