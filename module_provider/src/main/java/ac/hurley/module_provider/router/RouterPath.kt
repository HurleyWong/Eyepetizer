package ac.hurley.module_provider.router

/**
 * <pre>
 *      @author hurley
 *      date    : 3/25/21 10:55 AM
 *      github  : https://github.com/HurleyJames
 *      desc    :
 * </pre>
 */

object RouterPath {

    class Daily {
        companion object {
            const val PATH_DAILY_HOME = "/daily/home"
        }
    }

    class Discover {
        companion object {
            const val PATH_DISCOVER_HOME = "/discover/home"
        }
    }

    class Hot {
        companion object {
            const val PATH_HOT_HOME = "/hot/home"
        }
    }

    class User {
        companion object {
            const val PATH_USER_HOME = "/user/home"
        }
    }

    class Video {
        companion object {
            const val PATH_VIDEO_HOME = "/video/home"
            const val PATH_VIDEO_WATCH = "/video/watch"
        }
    }
}