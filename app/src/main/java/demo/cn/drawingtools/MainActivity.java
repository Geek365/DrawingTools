package demo.cn.drawingtools;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import demo.cn.drawingtools.model.DrawBaseModel;
import demo.cn.drawingtools.view.DrawPicView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView drawLine,drawRect,drawCircle,drawPath;
    private TextView clean,cancel,restore;
    private DrawPicView drawPicView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawLine= (TextView) findViewById(R.id.draw_line);
        drawRect= (TextView) findViewById(R.id.draw_rect);
        drawCircle= (TextView) findViewById(R.id.draw_circle);
        drawPath= (TextView) findViewById(R.id.draw_path);

        clean= (TextView) findViewById(R.id.clean);
        cancel= (TextView) findViewById(R.id.cancel);
        restore= (TextView) findViewById(R.id.restore);

        drawPicView = (DrawPicView) findViewById(R.id.draw);

        drawLine.setOnClickListener(this);
        drawRect.setOnClickListener(this);
        drawCircle.setOnClickListener(this);
        drawPath.setOnClickListener(this);

        clean.setOnClickListener(this);
        cancel.setOnClickListener(this);
        restore.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.draw_line:
                drawPicView.setType(DrawBaseModel.TPEY_LINE);
                break;
            case R.id.draw_rect:
                drawPicView.setType(DrawBaseModel.TPEY_RECT);
                break;
            case R.id.draw_circle:
                drawPicView.setType(DrawBaseModel.TPEY_CIRCLE);
                break;
            case R.id.draw_path:
                drawPicView.setType(DrawBaseModel.TPEY_PATH);
                break;
            case R.id.clean:
                drawPicView.clean();
                break;
            case R.id.cancel:
                drawPicView.cancel();
                break;
            case R.id.restore:
                drawPicView.restore();
                break;
        }
    }
}
