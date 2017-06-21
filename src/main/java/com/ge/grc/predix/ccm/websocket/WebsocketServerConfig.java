package com.ge.grc.predix.ccm.websocket;

import javax.websocket.ContainerProvider;
import javax.websocket.WebSocketContainer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.client.standard.WebSocketContainerFactoryBean;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;
import org.springframework.web.socket.server.standard.ServletServerContainerFactoryBean;

//import com.ccn.server.MyWebSocket;

@Configuration
public class WebsocketServerConfig {

	/**
	 * @return DataIngestionWebsocket
	 */
	@Bean
    public ServerEndPoint dataIngestionWebsocketEndpoint() {
        return new ServerEndPoint();
    }

    /**
     * @return -
     */
    @Bean
    public ServerEndpointExporter endpointExporter() {
        return new ServerEndpointExporter();
    } 
    
    /**
     * @return -
     */
    @Bean 
    public WebSocketContainer getWebsocketContainer() {
    	 return ContainerProvider.getWebSocketContainer();
    }
    @Bean
    public WebSocketContainerFactoryBean createWebSocketContainer() {
        WebSocketContainerFactoryBean container = new WebSocketContainerFactoryBean();
        container.setMaxTextMessageBufferSize(0);
        container.setMaxBinaryMessageBufferSize(0);
        return container;
    }
    @Bean
    public ServletServerContainerFactoryBean createServletServerContainerFactoryBean() {
        ServletServerContainerFactoryBean container = new ServletServerContainerFactoryBean();
        container.setMaxTextMessageBufferSize(32768);
        container.setMaxBinaryMessageBufferSize(32768);
        return container;
    }

}

