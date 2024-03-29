package ac.hurley.module_user.fragment

import ac.hurley.module_provider.router.RouterPath
import ac.hurley.module_user.activity.WatchHistoryActivity
import ac.hurley.module_user.databinding.UserFragmentBinding
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import kotlinx.android.synthetic.main.user_fragment.*

/**
 * <pre>
 *      @author hurley
 *      date    : 3/25/21 1:26 PM
 *      github  : https://github.com/HurleyJames
 *      desc    : 用户界面
 * </pre>
 */
@Route(path = RouterPath.User.PATH_USER_HOME)
class UserFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return UserFragmentBinding.inflate(inflater, container, false).root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        // 点击通知
        iv_user_notifications.setOnClickListener {
            ARouter.getInstance().build(RouterPath.User.PATH_USER_NOTIFICATION).navigation()
        }

        // 点击观看记录
        tv_watch_history.setOnClickListener {
            context?.let { context -> WatchHistoryActivity.start(context) }
        }

        // 点击设置
        tv_setting.setOnClickListener {
            ARouter.getInstance().build(RouterPath.User.PATH_USER_SETTING).navigation()
        }
    }


}