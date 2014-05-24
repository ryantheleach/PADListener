
package fr.neraud.padlistener.gui.fragment;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.util.Log;
import android.widget.ListAdapter;
import fr.neraud.padlistener.R;
import fr.neraud.padlistener.gui.helper.ChooseSyncDataPagerHelper;
import fr.neraud.padlistener.gui.helper.ChooseSyncMaterialsAdapter;
import fr.neraud.padlistener.model.ChooseSyncModel;

public class ChooseSyncMaterialsFragment extends ListFragment {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		Log.d(getClass().getName(), "onCreate");
		super.onCreate(savedInstanceState);

		final ChooseSyncModel result = (ChooseSyncModel) getArguments().getSerializable(
		        ChooseSyncDataPagerHelper.ARGUMENT_SYNC_RESULT_NAME);

		final ListAdapter adapter = new ChooseSyncMaterialsAdapter(getActivity().getApplicationContext(),
		        R.layout.choose_sync_materials_item, result.getSyncedMaterialsToUpdate());
		setListAdapter(adapter);
	}

}
