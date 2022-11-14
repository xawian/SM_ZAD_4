package pl.edu.pb.wi;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import java.util.UUID;

import pl.edu.pb.wi.SingleFragmentActivity;
import pl.edu.pb.wi.TaskFragment;
import pl.edu.pb.wi.TaskListFragment;

public class MainActivity extends SingleFragmentActivity{

    @Override
    protected Fragment createFragment(){
        UUID taskId = (UUID) getIntent().getSerializableExtra(TaskListFragment.KEY_EXTRA_TASK_ID);
        return TaskFragment.newInstance(taskId);
    }

}