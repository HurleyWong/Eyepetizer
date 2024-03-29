package ac.hurley.module_provider.player;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

import cn.jzvd.JZDataSource;
import cn.jzvd.JzvdStd;

/**
 * <pre>
 *      @author hurley
 *      date    : 4/4/21 11:13 PM
 *      github  : https://github.com/HurleyJames
 *      desc    :
 * </pre>
 */
public class JzvdStdShowTitleAfterFullscreen extends JzvdStd {
    public JzvdStdShowTitleAfterFullscreen(Context context) {
        super(context);
    }

    public JzvdStdShowTitleAfterFullscreen(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public void setUp(JZDataSource jzDataSource, int screen) {
        super.setUp(jzDataSource, screen);
        titleTextView.setVisibility(View.INVISIBLE);
    }

    @Override
    public void gotoFullscreen() {
        super.gotoFullscreen();
        titleTextView.setVisibility(View.VISIBLE);

    }

    @Override
    public void gotoNormalScreen() {
        super.gotoNormalScreen();
        titleTextView.setVisibility(View.INVISIBLE);
    }
}
