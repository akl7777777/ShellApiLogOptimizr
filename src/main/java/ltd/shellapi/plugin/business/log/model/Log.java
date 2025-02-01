package ltd.shellapi.plugin.business.log.model;

import lombok.Data;
import org.dromara.easyes.annotation.IndexField;
import org.dromara.easyes.annotation.IndexId;
import org.dromara.easyes.annotation.IndexName;
import org.dromara.easyes.annotation.rely.FieldStrategy;
import org.dromara.easyes.annotation.rely.FieldType;
import org.dromara.easyes.annotation.rely.IdType;

import java.util.Date;

@Data
@IndexName("log_index")
public class Log {

    @IndexId(type = IdType.CUSTOMIZE)
    @IndexField
    private String id;

    @IndexField
    private String requestId;

    @IndexField
    private int userId;

    @IndexField(fieldType = FieldType.DATE, dateFormat = "epoch_millis")
    private Date createdAt;

    @IndexField
    private int type;

    @IndexField(fieldType = FieldType.TEXT)
    private String content;

    @IndexField(strategy = FieldStrategy.NOT_EMPTY)
    private String username;

    @IndexField(strategy = FieldStrategy.NOT_EMPTY)
    private String tokenName;

    @IndexField(strategy = FieldStrategy.NOT_EMPTY)
    private String modelName;

    @IndexField(strategy = FieldStrategy.NOT_EMPTY)
    private String channelName;

    @IndexField
    private int quota;

    @IndexField
    private int promptTokens;

    @IndexField
    private int completionTokens;

    @IndexField
    private int channelId;

    @IndexField(strategy = FieldStrategy.NOT_EMPTY)
    private String tokenKey;

    @IndexField(fieldType = FieldType.TEXT)
    private String prompt;

    @IndexField(fieldType = FieldType.DATE, dateFormat = "epoch_millis")
    private long requestDuration;

    @IndexField(fieldType = FieldType.DATE, dateFormat = "epoch_millis")
    private long responseFirstByteDuration;

    @IndexField(fieldType = FieldType.DATE, dateFormat = "epoch_millis")
    private long totalDuration;

    @IndexField
    private boolean stream;  // 而不是 isStream

    @IndexField(strategy = FieldStrategy.NOT_EMPTY)
    private String ip;
}
