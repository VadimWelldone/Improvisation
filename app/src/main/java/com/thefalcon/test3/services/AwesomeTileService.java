package com.thefalcon.test3.services;

import android.annotation.SuppressLint;
import android.service.quicksettings.Tile;
import android.service.quicksettings.TileService;

import timber.log.Timber;

/**
 * @author Vadym Oliinyk
 * @email vadim.welldone@gmail.com
 * @date April 17, 2018
 */
@SuppressLint("NewApi")
public class AwesomeTileService extends TileService {
    @Override
    public void onTileAdded() {
        super.onTileAdded();
        Timber.e("onTileAdded");
    }

    @Override
    public void onTileRemoved() {
        super.onTileRemoved();
        Timber.e("onTileRemoved");
    }

    @Override
    public void onStartListening() {
        super.onStartListening();
        Timber.e("onStartListening");
    }

    @Override
    public void onStopListening() {
        super.onStopListening();
        Timber.e("onStopListening");
    }

    @Override
    public void onClick() {
        super.onClick();
        Timber.e("onClick");
        Tile tile = getQsTile();
        switch (tile.getState()) {
            case Tile.STATE_ACTIVE:
                tile.setState(Tile.STATE_INACTIVE);
                tile.setLabel("Lock Door");
                break;
            case Tile.STATE_INACTIVE:
                tile.setState(Tile.STATE_ACTIVE);
                tile.setLabel("Unlock Door");
                break;
            case Tile.STATE_UNAVAILABLE:
        }
        tile.updateTile();
    }
}