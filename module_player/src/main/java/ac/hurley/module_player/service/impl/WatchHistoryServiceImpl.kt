package ac.hurley.module_player.service.impl

import ac.hurley.module_player.util.WatchHistoryManager
import ac.hurley.module_provider.model.Data
import ac.hurley.module_provider.router.RouterPath
import ac.hurley.module_provider.service.WatchHistoryService
import android.content.Context
import com.alibaba.android.arouter.facade.annotation.Route

/**
 * <pre>
 *      @author hurley
 *      date    : 4/8/21 1:54 PM
 *      github  : https://github.com/HurleyJames
 *      desc    : 观看历史记录 Service 的具体实现类
 * </pre>
 */
@Route(path = RouterPath.Video.PATH_VIDEO_WATCH)
class WatchHistoryServiceImpl : WatchHistoryService {

    /**
     * 获取历史观看记录的列表
     */
    override fun getVideoWatchHistoryList(): MutableList<Data> =
        WatchHistoryManager.getWatchHistoryList()

    /**
     * 移除该历史观看记录列表
     */
    override fun removeVideoWatchHistory(data: Data) {
        WatchHistoryManager.removeWatchHistoryRecord(data)
    }

    override fun init(context: Context?) {

    }
}