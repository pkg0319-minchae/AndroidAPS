package info.nightscout.androidaps.plugins.pump.insight.app_layer.configuration;

import info.nightscout.androidaps.plugins.pump.insight.app_layer.AppLayerMessage;
import info.nightscout.androidaps.plugins.pump.insight.descriptors.MessagePriority;
import info.nightscout.androidaps.plugins.pump.insight.app_layer.Service;

public class OpenConfigurationWriteSessionMessage extends AppLayerMessage {

    public OpenConfigurationWriteSessionMessage() {
        super(MessagePriority.NORMAL, false, false, Service.CONFIGURATION);
    }
}
