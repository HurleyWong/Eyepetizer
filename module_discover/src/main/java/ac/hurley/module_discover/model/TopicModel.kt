package ac.hurley.module_discover.model

/**
 * <pre>
 *      @author hurley
 *      date    : 3/30/21 5:01 PM
 *      github  : https://github.com/HurleyJames
 *      desc    : 发现页面中主题版块的实体类
 * </pre>
 */
data class TopicModel(
    val adExist: Boolean,
    val count: Int,
    val itemList: MutableList<TopicItemModel>,
    val nextPageUrl: String,
    val total: Int
)

data class TopicItemModel(
    val adIndex: Int,
    val `data`: TopicItemData,
    val id: Int,
    val tag: Any,
    val trackingData: Any,
    val type: String
)

data class TopicItemData(
    val actionUrl: String,
    val adTrack: List<Any>,
    val autoPlay: Boolean,
    val dataType: String,
    val description: String,
    val header: Any,
    val id: Int,
    val image: String,
    val label: Label,
    val labelList: List<Any>,
    val shade: Boolean,
    val title: String
)

data class Label(
    val card: String,
    val detail: Any,
    val text: String
)

