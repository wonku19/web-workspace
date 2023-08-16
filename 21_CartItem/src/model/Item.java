package model;

public class Item {
	
	private int itemId;
	private String itemName;
	private int prive;
	private String description;
	private String pictureUrl;
	private int count;
	
	public Item() {}
	public Item(int itemId, String itemName, int prive, String description, String pictureUrl, int count) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.prive = prive;
		this.description = description;
		this.pictureUrl = pictureUrl;
		this.count = count;
	}
	
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getPrive() {
		return prive;
	}
	public void setPrive(int prive) {
		this.prive = prive;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPictureUrl() {
		return pictureUrl;
	}
	public void setPictureUrl(String pictureUrl) {
		this.pictureUrl = pictureUrl;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", prive=" + prive + ", description=" + description
				+ ", pictureUrl=" + pictureUrl + ", count=" + count + "]";
	}
	
	
}
