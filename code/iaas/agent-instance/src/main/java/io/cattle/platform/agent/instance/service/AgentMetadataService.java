package io.cattle.platform.agent.instance.service;

import io.cattle.platform.agent.instance.dao.AgentInstanceDao;
import io.cattle.platform.configitem.request.ConfigUpdateRequest;
import io.cattle.platform.configitem.version.ConfigItemStatusManager;
import io.cattle.platform.core.model.Agent;
import io.cattle.platform.core.util.SystemLabels;

import java.util.List;

import javax.inject.Inject;

public class AgentMetadataService {

    @Inject
    AgentInstanceDao agentInstanceDao;
    @Inject
    ConfigItemStatusManager statusManager;

    public void updateMetadata(Long accountId) {
        List<Long> agentIds = agentInstanceDao.getAgentProviderIgnoreHealth(SystemLabels.LABEL_AGENT_SERVICE_METADATA,
                accountId);
        for (long agentId : agentIds) {
            ConfigUpdateRequest request = ConfigUpdateRequest.forResource(Agent.class, agentId);
            request.addItem("metadata-answers");
            statusManager.updateConfig(request);
        }
    }

}
