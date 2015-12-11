package org.cyclops.integrateddynamics.api.network;

import javax.annotation.Nullable;

/**
 * Network elements that can delegate to elements that are automatically subscribed to the
 * {@link org.cyclops.integrateddynamics.api.network.event.INetworkEventBus}.
 * @param <D> The type of delegate that will be used as event listener for this network. Could be self or null.
 * @author rubensworks
 */
public interface IEventListenableNetworkElement<N extends INetwork<N>, D extends INetworkEventListener<N, ?>> extends INetworkElement<N> {

    /**
     * This listener will never be saved as an instance, this network element is always used as delegator to this listener.
     * @return The event listener.
     */
    public @Nullable D getNetworkEventListener();

}